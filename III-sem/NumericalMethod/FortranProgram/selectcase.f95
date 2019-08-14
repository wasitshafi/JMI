program selectcase
    implicit none;
    character ch;
    
    print *, "Enter character : ";
    read *, ch;
    
    select case (ch) ! CTM : we can also have nested select case for more info ref: https://www.tutorialspoint.com/fortran/nested_select_case_construct.htm
    case ('a') 
       print *, "Character is vowel";
    case ('e') 
       print *, "Character is vowel";
    case ('i') 
       print *, "Character is vowel";
    case ('o') 
       print *, "Character is vowel";
    case ('u') 
       print *, "Character is vowel";
    case default
       print *, "Character is not a vowel";
    end select

end program selectcase