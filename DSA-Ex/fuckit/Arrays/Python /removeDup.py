def removeDup(nums):
    if not nums:
        return 0
    
    i = 0

    for j in range(1,len(nums)):
        if nums[j] != nums[i]:
            i+= 1
            nums[i] = nums[j]

    return i+1
nums1 = [1, 1, 2]
k1 = removeDup(nums1)
print(k1, nums1[:k1])