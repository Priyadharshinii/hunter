num=(int(raw_input("Enter a number"))
sum=0
while num>0:
  r=num%10
  num=num/10
  sum=sum*10+r
 if sum==num:
  Print "palindrome"
 else:
  print "not a palindrome"
