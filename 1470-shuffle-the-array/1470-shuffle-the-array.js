/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    let ans = [];
    nums.map((e, i, arr) => {
        if(i < n) {
            ans.push(arr[i]);
            ans.push(arr[i+n]);
        }
    });
    return ans;
};