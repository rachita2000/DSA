package trie_and_huffman;
import java.util.ArrayList;

public class AutoComplete {
	private TrieNode root;
	public int count;
	public AutoComplete() {
		root = new TrieNode('\0');
	}

	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}
	
    
	private TrieNode findWord(TrieNode root, String word)
    {
        if(word.length()==0)
        {
            return root;
        }
        
        int childIndex=word.charAt(0)-'a';
        TrieNode child=root.children[childIndex];
        if(child==null)
        {
            return null;
        }
        
        return findWord(child, word.substring(1));
    }
    
    private void allPossibleWords(TrieNode root, String word, String output)
    {
        if(word.length()==0)
        {
            if(output.length()>0)
                System.out.println(word+output);
            
            return;
        }
       if(root.isTerminating)
       { 
           System.out.println(word+output);
       }
        for(int i=0;i<root.children.length;i++)
        {
            if(root.children[i] != null)
            {
                String add= output+root.children[i].data;
                
                allPossibleWords(root.children[i], word, add);
            }
        }
    }
    
	public void autoComplete(ArrayList<String> input, String word) {
		for(int i=0;i<input.size();i++)
        {
            add(input.get(i));
        }
        
    	TrieNode wordRoot=findWord(root, word);
        
        if(wordRoot==null || wordRoot.childCount==0)
            return;
        
		allPossibleWords(wordRoot, word, "");
    }

}