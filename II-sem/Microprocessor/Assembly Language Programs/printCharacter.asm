.model small
.stack 100h
.data     
 msg1 db 'Enter a character :$'
 msg2 db 'Entered character is :$' 
 c db ?
.code

main proc
    mov ax, @data
    mov ds, ax
    
    lea dx, msg1   ; print : 'Enter a character : '
    mov ah, 09h
    int 21h  
    
    mov ah,01h     ; read value 
    int 21h
    mov c, al      ; store vlaue    
    
    mov dl, 10     ; linefeed
    mov ah, 02h
    int 21h
    mov dl, 13     ; carriage return
    mov ah, 02h
    int 21h        
    
    lea dx, msg2   ; print : 'Entered character is : '
    mov ah, 09h
    int 21h  
    
    mov dl, c
    mov ah, 02h
    int 21h
    
    mov ax, 4ch
    int 21h
    
main endp
end main
    