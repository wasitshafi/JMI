.model small
.stack 100h
.data     
 str db 'HELLO WORLD$'
 
.code
main proc
    mov ax, @data
    mov ds, ax
               
    mov cx, 10
loop1:           
    lea dx, str
    mov ah, 09h
    int 21h  
    
    mov dl, 10
    mov ah, 02h
    int 21h
    mov dl, 13
    mov ah, 02h
    int 21h
loop loop1
    
    mov ah, 4ch
    int 21h
        
main endp
end main