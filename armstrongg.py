num=int(input("Enter a number"))
c=0
while num>0:
  r=num%10
  num=num/10
  c=c+power(r,3)
 if num==c:
  print "Armstrong Number"
 else:
  print "Not An Armstrong Number"
