.model small
.stack 100h
.data
 msg1 db 'String = hello world$'
 msg2 db 'Reverse of string = $'
 string db 'hello world$'
.code
                   
main proc
    mov ax, @data
    mov ds, ax
 
    lea dx, msg1  ; print msg1
    mov ah, 09h
    int 21h
             
    mov dl, 10    ; line feed
    mov ah, 02h
    int 21h
    mov dl, 13
    mov ah, 02h
    int 21h
       
    lea dx, msg2  ; print msg2
    mov ah, 09h
    int 21h
          
    mov cx, 11    ; 11 is string length     
    mov si, offset string
     
    mov cx, 11 
    loop1:
    
     mov bx,[si]
     push bx
     inc si
     loop loop1
               
    mov cx, 11 
              
    loop2:
    
    pop dx  
    mov ah, 02h
    int 21h
    loop loop2
    
    mov ah, 4ch
    int 21h
    
main endp
end main
