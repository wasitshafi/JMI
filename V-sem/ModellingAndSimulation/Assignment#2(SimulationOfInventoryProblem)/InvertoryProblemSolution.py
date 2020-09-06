import sys
import random

def func(reorder_point, reorder_quantity):
    N = 180
    total_cost = 0.0
    stock = 155
    outstanding_order = 0
    due_date = 0

    for i in range(1,N+1):
        if due_date == i:
            stock += reorder_quantity
            outstanding_order = 0
        else:
            demand = random.uniform(1, 98)
            if demand > stock:
                total_cost += (demand - stock) * 18
                stock = 0
            else:
                stock = stock - demand
                total_cost = total_cost + stock * .75

            equivalent_stock  = stock + outstanding_order

            if(equivalent_stock <= reorder_point):
                outstanding_order = reorder_point
                due_date = i + 3
                total_cost = total_cost + 75
        return total_cost

print('           Reorder Point    Reorder Quantity')
print('Policy 1 :     125                150')
print('Policy 2 :     125                250')
print('Policy 3 :     150                250')
print('Policy 4 :     175                250')
print('Policy 5 :     175                300')

costs=[]
costs.append(func(125, 150))
costs.append(func(125, 250))
costs.append(func(150, 250))
costs.append(func(175, 250))
costs.append(func(175, 300))

policy_no = 1
min = sys.maxsize
min_cost_policy = 0

print()
for c in costs:
    print('Total Cost using policy no', policy_no, 'is : ', '{:.2f}'.format(c))
    if c < min:
        min = c
        min_cost_policy_no = policy_no
    policy_no +=1

print('\nPolicy No', min_cost_policy_no, 'Results in Minumum Cost')