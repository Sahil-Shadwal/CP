def moveZ(nums):
    non = 0

    for i in range(len(nums)):
        if nums[i] != 0:
            nums[non],nums[i] = nums[i],nums[non]
            non += 1

arr = [0, 1, 0, 3, 12]
moveZ(arr)
print(arr)