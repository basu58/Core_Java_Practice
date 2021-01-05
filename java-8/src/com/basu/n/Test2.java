package com.basu.n;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// This solution is shared from APAS. The highest rated coding interview algorithm learning APP on Android! Download it from here: https://goo.gl/YXD3m2
	/**
	 * Build a trie for the words
	 * When backtracking, move forward with the trie node
	 * Do pruning when the current char is not in the trie
	 */
	public List<String> findWords(char[][] board, String[] words) {
	  List<String> res = new ArrayList<>();
	  TrieNode root = buildTrie(words);
	  for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
	      dfs(board, i, j, root, res);
	    }
	  }
	  return res;
	}

	/**
	 * Build a trie from the words
	 * Store word in the ending node
	 */
	private TrieNode buildTrie(String[] words) {
	  TrieNode root = new TrieNode();
	  for (String w : words) {
	    TrieNode node = root;
	    for (char c : w.toCharArray()) {
	      int i = c - ''a'';
	      if (node.next[i] == null) node.next[i] = new TrieNode();
	      node = node.next[i];
	    }
	    node.word = w;
	  }
	  return root;
	}

	/**
	 * Backtrack in the board
	 * Set a character to # to mark it as visited
	 * Remember to reset it after all 4 adjacent nodes are traversed
	 * <p>
	 * Get current char in board
	 * Make sure it''s not already visited and it''s in trie
	 * Move trie node one step down to process current word
	 * Set word in node to null after adding it to the result list
	 * Set visited and backtrack adjacent nodes
	 * Reset visited mark
	 */
	private void dfs(char[][] board, int i, int j, TrieNode node, List<String> res) {
	  char c = board[i][j];
	  if (c == ''#'' || node.next[c - ''a''] == null) return;
	  node = node.next[c - ''a''];
	  if (node.word != null) { // Found one
	    res.add(node.word);
	    node.word = null; // De-dup
	  }

	  board[i][j] = ''#''; // Mark as visited
	  if (i > 0) dfs(board, i - 1, j, node, res);
	  if (j > 0) dfs(board, i, j - 1, node, res);
	  if (i < board.length - 1) dfs(board, i + 1, j, node, res);
	  if (j < board[i].length - 1) dfs(board, i, j + 1, node, res);
	  board[i][j] = c; // Reset mark
	}

	class TrieNode {
	  TrieNode[] next = new TrieNode[26];
	  String word;
	}
	// This solution is shared from APAS. The highest rated coding interview algorithm learning APP on Android! Download it from here: https://goo.gl/YXD3m2

}
