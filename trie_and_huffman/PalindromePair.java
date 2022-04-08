package trie_and_huffman;
import java.util.*;

public class PalindromePair {
	
	private TrieNode root;
	public int count;

	public PalindromePair() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		

		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];

		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}

		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0) {
			return root.isTerminating;
		}

		int childIndex=word.charAt(0) - 'a';
		TrieNode child=root.children[childIndex];

		if(child == null) {
			return false;
		}

		return search(child,word.substring(1));

	}

	public boolean search(String word) {
		return search(root,word);
	}

	private void print(TrieNode root, String word) {
		if (root == null) {
			return;
		}
		
		if (root.isTerminating) {
			System.out.println(word);
		}
		
		for (TrieNode child : root.children) {
			if (child == null) {
				continue;
			}
			String fwd = word + child.data;
			print(child, fwd);
		}
	}
	
	public void print() {
		print(this.root, "");
	}





	/*..................... Palindrome Pair................... */


	public boolean isPalindromePair(ArrayList<String> words) {
		ArrayList<String> reverseWords=new ArrayList<>();
        for(int i=0;i<words.size();i++)
        {
        	add(root, words.get(i));
        	for(int j=0;j<words.get(i).length();j++) {
        		add(root, words.get(i).substring(j));
        	}
            for(int j=words.get(i).length();j>0;j--) {
        		add(root, words.get(i).substring(0,j));
        	}
        }
        for(int i=0;i<words.size();i++)
        {
            String s=words.get(i);
            reverseWords.add(reverse(s));
        }
        for(int i=0;i<reverseWords.size();i++)
        {
            boolean flag=search(reverseWords.get(i));
                if(flag)
                return true;
        }
        return false;
	}

	private String reverse(String s)
    {
        String ans="";
        while(s.length()!=0)
        {
           ans = s.charAt(0) + ans;
            s=s.substring(1);
        }
        
        return ans;
    }
	
}
