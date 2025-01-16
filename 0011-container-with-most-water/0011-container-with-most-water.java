class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int begin = 0;
        int end = height.length - 1;
        while (end > begin) {
            int area = (end - begin) * Integer.min(height[begin], height[end]);
            if (area > maxArea)
                maxArea = area;
            if (height[begin] > height[end])
                end--;
            else
                begin++;
        }
        return maxArea;
    }
}