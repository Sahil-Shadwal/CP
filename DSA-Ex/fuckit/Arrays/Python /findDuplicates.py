def findDup(nums):
    slow = fast = nums[0]

    while True:
        slow = nums[slow]
        fast = nums[nums[fast]]
        if slow == fast:
            break

    slow = nums[0]
    while slow != fast:
        slow = nums[slow]
        fast = nums[fast]

    return slow

print(findDup([1, 3, 4, 2, 2]))  # Output: 2
print(findDup([3, 1, 3, 4, 2]))  # Output: 3
print(findDup([3, 3, 3, 3, 3]))  # Output: 3