class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans=[]
        ans=nums+nums
        return ans
    

# tried
# nums=[1,2,1]
def getConcatenation(ans): 
    # nums=[1,2,1]
    # ans=[]
    ans=nums+nums
    print(ans)
    return ans
if __name__ == "__main__":
    nums=[1,2,1]
    ans=[]
    getConcatenation(nums)
    # print(ans)