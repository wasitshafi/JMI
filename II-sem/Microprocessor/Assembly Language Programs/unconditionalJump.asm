.model small
.stack 100h
.data
  msg1 db "Hello world...!$"
  msg2 db "i am wasit shafi!$"
.code

main proc
    mov ax, @data
    mov ds, ax
          
    up:
    lea dx, msg1
    mov ah, 09h
    int 21H
    
    
    mov dl, 10   ;line feed
    mov ah, 02h
    int 21h
    mov dl, 13   ;Carriage return for printing from statring point
    mov ah, 02h
    int 21h
    
   
    lea dx, msg2
    mov ah, 09h
    int 21H
    
    
    mov dl, 10   ;line feed
    mov ah, 02h
    int 21h
    mov dl, 13   ;Carriage return for printing from statring point
    mov ah, 02h
    int 21h
           
    jmp up
   
    mov ax, 4ch
    int 21h
    
    main endp
end main
    
    
    
