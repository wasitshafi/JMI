.model small
.stack 100h
.data      
.code
main proc
     mov cx, 10
    mov dx,48 
loop1:           
    mov ah, 2
    int 21h  
    
  ;  mov dl, 10
   ; mov ah, 02h
   ; int 21h
   ; mov dl, 13
    ;mov ah, 02h
   ; int 21h   
    
    inc dx
    
loop loop1
    
    mov ah, 4ch
    int 21h
        
main endp
end main