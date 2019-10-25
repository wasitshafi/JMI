.model small
.stack 100h
.data

.code

main proc
    mov ax,@data
    mov ds,ax
    
    
    mov [50], 4
    mov [51], 3
    
    mov al, [50]
    add al, [51]
    add al, 48  
    
    mov dl,al
      
    mov ah, 02h
    int 21h
    
    mov ax, 4ch
    int 21h
            
    main endp
end main