; PROGRAM  :: PROGRAM TO READ AN ALPHANUMERIC CHARACTER AND DISPLAY ITS
; EQUIVALENT ASCII CODE AT THE CENTRE OF THE SCREEN

.MODEL SMALL

DISPLAY MACRO MSG
        LEA DX, MSG
        MOV AH, 09H
        INT 21H
ENDM

; MACRO TO DISPLAY A CHARACTER.
DISPCHAR MACRO
        MOV AH, 02H
        INT 21H
ENDM

.DATA
MSG1 DB 0DH, 0AH, "ENTER AN ALPHANUMERIC CHARACTER :: $"
;MSG2 DB 0DH, 0AH, "NOT AN ALPHANUMERIC CHARACTER...$"

.CODE
START : MOV AX, @DATA
        MOV DS, AX
        DISPLAY MSG1
        MOV AH, 01H
        INT 21H
 ;       CALL CHECK              ; CHECK FOR ALPHANUMERIC CHARACTER...
  ;      JC ERROR
        PUSH AX
        ; SET MODE AND CLEAR THE SCREEN
        ; ROW =25 AND COLUMN = 80
        MOV AH, 00H
        MOV AL, 03H
;        INT 10H
        ; MOVE THE CURSOR TO THE MID POINT OF SCREEN
        MOV AH, 02H
        MOV BH, 00H             ; PAGE NUMBER
        MOV DH, 12D             ; ROW VALUE
        MOV DL, 40D             ; COLUMN VALUE
 ;       INT 10H
        POP AX                  ; RESTORE THE CHARACTER.
        AAM                    
        PUSH AX
        MOV AL, AH
        XOR AH, AH
        AAM
        ADD AX, 3030H
        MOV DL, AH
        PUSH AX
        DISPCHAR                ; DISPLAY THE ASCII VALUE
        POP AX
        MOV DL, AL
        DISPCHAR
        POP AX
        ADD AL, 30H
        MOV DL, AL
        DISPCHAR
        ; WAIT FOR USER TO PRESS ANY KEY
        MOV AH, 07H
        INT 21H
        ; FINISH ...JOB OVER
        JMP FINAL
ERROR : ;DISPLAY MSG2
        JMP FINAL

; THIS PROCEDURE CHECKS WHETHER THE INPUT IS ALPHANUMERIC OR NOT
CHECK PROC NEAR
        CMP AL, 30H
        JE FRET
        JC ERR
        CMP AL, 39H
        JE FRET
        JNC NEXT
        JC FRET
NEXT :  CMP AL, 41H
        JE FRET
        JC ERR
        CMP AL, 5AH
        JE FRET
        JNC NEXT1
        JC FRET
NEXT1 : CMP AL, 61H
        JE FRET
        JC ERR
        CMP AL, 7AH
        JE FRET
        JNC ERR
        JC FRET
ERR : STC               ; SET CARRY FOR ERROR
RET
FRET: CLC
RET
CHECK ENDP
; PROCEDURE ENDS HERE

FINAL : MOV AH, 4CH
        INT 21H
END START
