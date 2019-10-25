.model small
.stack 100h
.data

.code

main proc
    mov ax,@data
    mov ds,ax
    
    
    mov [50], 48   ; store 0 at memory location 50
    mov al, [50] 
    
    mov ah, 02h
    int 21h
    
    mov ax, 4ch
    int 21h
    
    main endp
end main