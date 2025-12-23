<?php
#------------Boolean
#it return 1 if true and no return for false.
$bool1=true;
$bool2=false;
$bool3=1;
echo "bool1= {$bool1}<hr>bool2= {$bool2}";
#function
#is_bool
echo  '<hr>boolean test bool1:-'
.is_bool($bool1).'<hr>boolean test bool3:-'
.is_bool($bool3);
?>