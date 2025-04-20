recipe = input().strip()
nb,ns,nc = map(int,input().split())
pb,ps,pc = map(int, input().split())
r = int(input())

req_b = recipe.count('B')
req_s = recipe.count('S')
req_c = recipe.count('C')

left = 0
right = 10**18

answer = 0
while left<= right:
    mid = (left+right)//2

    needed_b = max(0,req_b*mid - nb)
    needed_s = max(0, req_s*mid - ns)
    needed_c = max(0, req_c*mid -nc)

    total_cost = needed_b * pb + needed_s*ps + needed_c*pc

    if total_cost <= r:
        answer = mid
        left = mid +1
    else:
        right = mid - 1
print(answer)