/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    var result="";
    
    for(char of address) {
        if(char === ".")
            result += "[.]";
        else
            result += char;
    }
    
    return result;    
};