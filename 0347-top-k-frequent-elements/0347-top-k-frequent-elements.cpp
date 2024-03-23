class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        int n = nums.size();
        map<int, int> count;

        for(auto n : nums) {
            count[n]++;
        }

        vector<vector<int>> freq(n + 1);
        for(auto it = count.begin(); it != count.end(); it++) {
            freq[it->second].push_back(it->first);
        }

        vector<int> res;
        for (int i = n; i >= 0; i--) {
            if (res.size() >= k) {
                    break;
                }
            if (!freq[i].empty()) {
                res.insert(res.end(), freq[i].begin(), freq[i].end()); 
            }
        }
        return res;
    }
};