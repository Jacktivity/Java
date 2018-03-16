
%A is ONE or ZERO

ZERO = [1;0];

ONE = [0;1];

Hadamard = (1/sqrt(2))*[1,1;1,-1];

%Hadamard * ONE  = B1


 B1 =[0.7071
     -0.7071];

%Hadamard * ZERO = B0

 B0 =[0.7071
      0.7071];


%State C is either of the below
%Hadamard * B1  = ONE

%Hadamard * B0 = ZERO

%If either are these are run through a Hadamard gate twice they return to
%their original value

%If someone was using probabilities it would be less accurate although
%easier, it would start 100% ONE or ZERO, then it'd be 50% ONE or ZERO then
%be 100% ONE or ZERO again. where as the matrix, you can follow whether
%it'll be either one as the B1 has a -0.7071 where as B0 does not.

%The probabilities make reversal impossible due to the loss of information