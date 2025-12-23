<?php
#integer are real numbers like (1,5,10,49)
#error
#agar syntax wrong honge to (Parse error: syntax error, unexpected token ":" in C)

$num1=10;
$num2=30;

echo '<hr>';

echo $num1;

echo '<hr>';

echo $num2;

echo '<hr>';

#operation (  + ,- , * , /)

$res1=$num1+$num2;   #Addition
echo $res1;
echo '<hr>';
$res2=$num1-$num2;   #Subtraction
echo $res2;
echo '<hr>';
$res3=$num1/$num2;   #divide
echo $res3;
echo '<hr>';
$res4=$num1*$num2;   #Multiplication
echo $res4;
echo '<hr>';

#Basic calculation(a+*c/d)
$res5=$num1+$num2*20/3;
echo $res5;
echo'<hr>';
#Increment / Decrement 
$i=1;
echo $i;
 echo'<hr>';
 $i++;

 $i++;
 echo $i;


 #FUNCTION IN INTEGERS 

 //rand ()

 echo'<hr>';
 echo rand();
 echo'<hr>';
?>