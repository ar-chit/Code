/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function (nums1, nums2) {
    var ans = [];
        for (var i = 0; i < nums1.length; i++){
            for (var j = 0; j < nums2.length; j++){
                if (nums1[i] === nums2[j]){
                    ans.push(nums1[i]);
                }
            }
        }
    
    const uniqueAns = ans.filter((value, index, array) => array.indexOf(value) === index);
    
    return uniqueAns;
};