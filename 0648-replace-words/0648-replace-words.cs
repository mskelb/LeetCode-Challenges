public class Solution 
{
    public string ReplaceWords(IList<string> dictionary, string sentence) 
    {
        HashSet<string> roots = new HashSet<string>(dictionary);
        string result = ""; 

        foreach (var word in sentence.Split(' ')) 
        {
            string root = GetShortestRoot(roots, word);
            result += root + " ";
        }

        return result.Trim();
    }

    static string GetShortestRoot(HashSet<string> roots, string word)
    {
        string shortestRoot = word;

        foreach (string root in roots)
        {
            if (word.StartsWith(root) && root.Length < shortestRoot.Length)
            {
                shortestRoot = root;
            }
        }

        return shortestRoot;
    }

    // You may have other methods or members here if needed
}