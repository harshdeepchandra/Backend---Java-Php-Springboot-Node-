<?php
#--------------float
$float1=10.256;
$float2=10.00;
echo $float1;
# float automatcally round off kar sakta hai 
echo '<hr>'.$float2;
#error
//echo 100/0;
#Fatal error: Uncaught DivisionByZeroError: Division by zero in C

#function for roundoff
$float3=10.8576;
echo "<hr>original value = $float3";
echo '<hr>round off value(3) ='.round($float3,3);
#ceil (top value)
echo '<hr>ceil(top value) ='.ceil($float3);
echo '<hr>floor(low value) ='.floor($float3);
#------------Type-Testing
$num1=21;
$float4=21.675;
echo '<hr> integer test ---'.is_int($num1);
echo '<hr> integer test ---'.is_int($float4);
echo '<hr> float test ---'.is_float($float4);
echo '<hr> numaric test ---'. is_numeric($float4);
?>