package binary.tree.practice;

public class BST {

	private BSTNode root;

	public BST(){
		this.root = null;
		
	}
        
        public int count(BSTNode current)
        {
            if(current == null)
            {
                
                return 0;
            }
           return 1 + count(current.getLeft()) + count(current.getRight());
             
        }
	
	public void postOrder(BSTNode current){
		if(current != null){
			if(current.getLeft() != null){
				postOrder(current.getLeft());
			}			
			if(current.getRight() != null){
				postOrder(current.getRight());
			}
			System.out.print(current.getData());
		}
                System.out.println();
	}
	public void preOrder(BSTNode current){
		if(current != null){
			System.out.print(current.getData());
			if(current.getLeft() != null){
				preOrder(current.getLeft());
			}			
			if(current.getRight() != null){
				preOrder(current.getRight());
			}
		}
                System.out.println();
	}	
	public void inOrder(BSTNode current){
		if(current != null){
			if(current.getLeft() != null){
				inOrder(current.getLeft());
			}			
			System.out.print(current.getData());
			if(current.getRight() != null){
				inOrder(current.getRight());
			}
		}
                System.out.println();
	}
	
	public boolean remove(String item){
		
		if(this.root == null){
			return false;
		}else if(this.root.getData().compareTo(item) == 0){
			if(this.root.getRight() == null){
				this.root = this.root.getLeft();
				return true;
			}else{
				// need to find the leftmost grandchild
				BSTNode FindLeftGrandKid = this.root.getRight();
				while(FindLeftGrandKid.getLeft() != null){
					FindLeftGrandKid = FindLeftGrandKid.getLeft();
				}
				FindLeftGrandKid.setLeft(this.root.getLeft());
				this.root = this.root.getRight();
				return true;
			}
		}else{
			BSTNode current = this.root;
			BSTNode previous = null;
			while(true){
				if(current.getData().compareTo(item) < 0 && current.getRight() != null){
					previous = current;
					current = current.getRight();
				}else if(current.getData().compareTo(item) > 0 && current.getLeft() != null){
					previous = current;
					current = current.getLeft();
				}else if(current.getData().compareTo(item) == 0){
					// need to find the leftmost grandchild
					if(current.getRight() == null){
						previous.setRight(current.getLeft()); 
						return true;
					}else{
						BSTNode FindLeftGrandKid = current.getRight();
						while(FindLeftGrandKid.getLeft() != null){
							FindLeftGrandKid = FindLeftGrandKid.getLeft();
						}
						FindLeftGrandKid.setLeft(current.getLeft());
						previous.setRight(current.getRight());
						return true;
					}
				}else{
					return false;
				}
			}
		}
		
	
	}
	
	public boolean find(String item){
	BSTNode current = this.root;
	
	while(current != null){
		if(current.getData().compareTo(item) == 0){
			return true;
		}else if(current.getData().compareTo(item) < 0){
			current = current.getRight();
		}else{
			current = current.getLeft();
		}
	}
	return false;
		
	}
	
	public boolean insert(String item){
	
		if(this.root == null){
			// Tree is totally empty, so item is in the new root
			this.root = new BSTNode(item);
			return true;
		}else{
			// Traverse BST to find the item's parent node...
			BSTNode current = this.root;
			while(true){
				if(current.getData().compareTo(item) == 0){
					return false;
				}else if(current.getData().compareTo(item) < 0){
					if(current.getRight() == null){
						current.setRight(new BSTNode(item));
						return true;
					}else{
						current = current.getRight();
					}
				}else{
					if(current.getLeft() == null){
						current.setLeft(new BSTNode(item));
						return true;
					}else{
						current = current.getLeft();
					}
				}
			}
		}
		
		
		
		
		
	}
	
		
	
	public BSTNode getRoot() {
		return root;
	}

	public void setRoot(BSTNode root) {
		this.root = root;
	}
	
	
	
	
	
}
