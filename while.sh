a=0
while [ $a -lt 10 ]
do
a=` expr $a + 1 `
echo $a
done
echo "end of the loop"
