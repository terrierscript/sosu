module Main where
import Debug.Trace

sosu 2 = [2]
sosu n = do
    let spl = split n
    if spl == n
        then [n]
        else sosu spl ++ (sosu (div n spl))

split :: Int -> Int
split n = _split n (n-1) -- TODO sqrt

_split :: Int -> Int -> Int
_split n 1 = n
_split n i = {-- trace(show [n,i]) $--} do
    if mod n i == 0
        then i
        else _split n (i-1)

print_sosu 2 = print "end"
print_sosu n = do 
    print(sosu n)
    print_sosu (n-1)

main = do
    putStrLn "start"
    print_sosu 1000