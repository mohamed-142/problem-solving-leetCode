/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = nums => {
    nums.reduce((p, c, i, arr) => arr[i] += p);
    return nums;
};