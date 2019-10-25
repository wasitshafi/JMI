.model small
.stack 100h
.data     
 msg1 db 'Enter value of x :$'
 msg2 db 'Enter value of y :$'
 msg3 db 'x = $'
 msg4 db 'y = $' 
 msg5 db 'x and y are equal numbers$'
 msg6 db 'x and y are not equal numbers$'
 x db ?
 y db ?
.code

main proc
    mov ax, @data
    mov ds, ax
    
    lea dx, msg1   ; print : 'Enter value  of x : '
    mov ah, 09h
    int 21h  
    
    mov ah,01h     ; read value 
    int 21h                    
    mov x, al      ; store in x
    
    mov dl, 10     ; linefeed
    mov ah, 02h
    int 21h
    mov dl, 13     ; carriage return
    mov ah, 02h
    int 21h
    
    lea dx, msg2   ; print : 'Enter value  of y : '
    mov ah, 09h
    int 21h
    
    mov ah,01h     ; read value
    int 21h         
    mov y, al      ; store in y
    
    mov dl, 10     ; linefeed
    mov ah, 02h
    int 21h
    mov dl, 13     ; carriage return
    mov ah, 02h
    int 21h
    
    lea dx, msg3   ; print : 'x = '
    mov ah, 09h
    int 21h     
              
    mov dl, x      ; print value of variable 'x'
    mov ah, 02h
    int 21h
    
     
    mov dl, 10     ; linefeed
    mov ah, 02h
    int 21h
    mov dl, 13     ; carriage return
    mov ah, 02h
    int 21h
    
    lea dx, msg4   ; print : 'y : '
    mov ah, 09h
    int 21h     
              
    mov dl, y      ; print value of variable 'y'
    mov ah, 02h
    int 21h
 
     
    
    mov dl, 10     ; linefeed
    mov ah, 02h
    int 21h
    mov dl, 13     ; carriage return
    mov ah, 02h
    int 21h
                                                            
                                                       
    mov al, x      ; put any one operand in register   
    cmp dl, y 
    je l1
    
    lea dx, msg6   ; print : 'x and y are not equal numbers'
    mov ah, 09h
    int 21h
    
    mov ax, 4ch
    int 21h
    
    l1:
    lea dx, msg5   ; print : 'x and y are equal numbers'
    mov ah, 9
    int 21h
    
    mov ax,4ch
    int 21h
    
main endp
end main
    