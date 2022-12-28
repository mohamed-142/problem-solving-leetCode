/**
 * @param {string[]} operations
 * @return {number}
 */
var finalValueAfterOperations = function(operations) {
    let x = 0;
    operations.map(e => e.includes("+") ? x++ : x--);
    return x;
};