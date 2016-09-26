# FindKthPrime
Design an algorithm to find the kth number such that the only prime factors are 3,5,7

The Kth number should be 3 or 5 or 7* a previous number

Or when we add the first number, 3,5,7, we add 3*3,3*5,3*7 into the list, when we need to find the next one, find the smallest from the product

if(a suitable product is from 3) l3: add 3*product, l5:add 5*product, l7:add 7*product

if(a suitable product is from 5) l5:add 5*product, l7:add 7*product

if(a suitable product is from 7) l7:add 7*product

This is because 3*7 was added to l3 first, so we don't add 7*3 to l7 any more

