def buySell(nums):
    min_price = float('inf')
    max_profit = 0

    for i in range(len(nums)):
        if nums[i] < min_price:
            min_price = nums[i]  
        elif nums[i] - min_price > max_profit:
            max_profit = nums[i] - min_price 

    return max_profit

# Test Cases
prices = [7,1,5,3,6,4]
print(buySell(prices))  # Output: 5

prices = [7,6,4,3,1]
print(buySell(prices))  # Output: 0
