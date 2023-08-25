#
# @lc app=leetcode id=242 lang=python
#
# [242] Valid Anagram
#

# @lc code=start
class Solution(object):
    def isAnagram(self, s, t):
       s_letters = {}
       t_letters = {}

       if len(s) != len(t): # if the length of the strigns aren't the same then they can't be anagrams
           return False
       
       for i in range(0, len(s)): # add every letter in string s to a dictionary and the number of occurences
           if s[i] in s_letters:
               s_letters[s[i]] = s_letters[s[i]] + 1
           else:
               s_letters[s[i]] = 1
        
       t_letters = {}
       for i in range(0, len(t)): # add every letter in string t to a dictionary and the number of occurences
           if t[i] in t_letters:
               t_letters[t[i]] = t_letters[t[i]] + 1
           else:
               t_letters[t[i]] = 1
       
       for i in s_letters:
           if i not in t_letters: # if any letter is not present in the t dict then the words aren't anagrams
               return False
           if s_letters[i] != t_letters[i]: # if the number of occurences of a letter aren't the same then they aren't anagrams
               return False
       return True # if passes all checks then both strings are anagrams        
           
       

        
# @lc code=end
s = "aacc" 
t = "ccac"
test = Solution().isAnagram(s, t)
print(test)
