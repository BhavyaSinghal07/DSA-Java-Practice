/* Properties of modulo: 
   (a+b)%m = ((a%m) + (b%m)) %m
   (a-b)%m = ((a%m) - (b%m) + m) %m
   (a*b)%m = ((a%m) * (b%m)) %m
   (a/b)%m = ((a%m) * ( b^(-1) %m)) %m
   (a%m) %m = a%m
   m^(x) %m = 0,  for all x are +ve integers

   Note: => ( b^(-1) %m ) is multiplicative modulo inverse, where b & m are co-primes as no common factor other than 1 
             ex: (6*y)%7 = 1 then y is multiplicative modulo inverse for 6 & y=6, as (6*6)%7 = 1
         => if p is prime no which is not a divisor of b, then ab(p-1)%p = a%p,  due to Fermet's Litte Theorem
*/ 



public class moduloProperty {
    
}
