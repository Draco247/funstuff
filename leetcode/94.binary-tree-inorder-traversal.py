#
# @lc app=leetcode id=94 lang=python
#
# [94] Binary Tree Inorder Traversal
#

# @lc code=start
# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution(object):
    def inorderTraversal(self, root):

        if root:
            # first the left children are traversed to make sure they are visited in the correct order
            # next the root is added to make sure that it is visited before the right children are traversed
            # finally the right children are traversed
            return self.inorderTraversal(root.left) + [root.val] + self.inorderTraversal(root.right)
        else:# if the tree has no nodes then return an empty list
            return []
        
# @lc code=end
root = TreeNode(1)
root.right = TreeNode(2)
root.right.left = TreeNode(3)


test = Solution().inorderTraversal(root)
print(test)

