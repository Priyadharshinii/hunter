num=int(input("Enter a number"))
exp=int(input("Enter exponential value"))
if exp==1:
  print num
elif exp==0:
  print "1"
 else:
  pow=num*power(num,exp-1)
  print pow
