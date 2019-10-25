.model small
.stack 10h
.data
    str db "Electrical & Electronics$"
.code
 
 main PROC       
 mov ax, @data
 mov ds, ax
 
 lea dx,str
 mov ah, 09h
 int 21h
 
 mov ax,4ch
 int 21h
 main ENDP
    
END main


