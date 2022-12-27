/**
 * @param {number[]} nums
 * @return {number[]}
 */
var buildArray = function(nums) {
    let ans = [];
    nums.forEach(e => ans.push(nums[e]));
    return ans;
};