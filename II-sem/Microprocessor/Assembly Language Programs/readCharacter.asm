.model small
.stack 100h
.data
    msg1 db "Enter character : $"  
    msg2 db "Character is : $"
    char db ?
.code
main proc                    
    
    mov ax, @data
    mov ds, ax
      
    lea ax, msg1  ; printing msg
    mov ah, 09h
    int 21h   
                    
    mov ah, 01h   ; it will wait for a single character and will store that in al register
    int 21h  
                       
    mov char, al    ; store the entered character 
                   
    mov dl, 10    ; line feed
    mov ah, 02h
    int 21h
    
    mov dl, 13    ; carriage return
    mov ah, 02h
    int 21h
    
    lea dx, msg2  ; print msg
    mov ah, 09h
    int 21h     
     
    mov dl, char  
    mov ah, 02h
    int 21h          
                  

    mov ax, 4ch
    int 21h
    
    main endp
end main