read -p "Enter a number:" c
x=$c
sum=0
r=0
n=0
while [ $x -gt 0 ]
do
r=`expr $x % 10`
n=`expr $r \* $r \* $r`
sum=`expr $sum + $n`
x=`expr $x / 10 `
done
if [ $sum -eq $c ]
then 
echo "It's Armstrong"
else
echo "Not an Armstrong"
fi
