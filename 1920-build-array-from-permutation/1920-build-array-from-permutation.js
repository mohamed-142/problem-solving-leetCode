/**
 * @param {number[]} nums
 * @return {number[]}
 */
var buildArray = nums => nums.map((_,i) => nums[nums[i]]);