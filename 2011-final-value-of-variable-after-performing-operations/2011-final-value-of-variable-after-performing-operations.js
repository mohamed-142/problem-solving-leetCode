/**
 * @param {string[]} operations
 * @return {number}
 */
var finalValueAfterOperations = function(operations) {
    let p = operations.filter((op)=> op.includes('+')).length;
    let m = operations.length - p;
    return p + (m*-1)
};