.model small
.stack 10h
.data
  num db 23
  d db 10
  sum db 0
.code
  mov ax,@data
  mov ds,ax
lbl1:
      mov al,num
      mov ah,0 ;clearing ah R
      div d

      mov num,al
      mov al,ah
      add al,sum
      mov sum,al

      cmp num,0
      jne lbl1

      mov al,sum
      add al,48

      mov dl,al
      mov ah,02h
      int 21h

       mov ah,4ch
      int 21h
end