<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
 
 
</head>
<body>
    <div class="container">
        <h1>Linked List Java Project</h1>
        <p><strong>Developer:</strong> Sifiso vinjwa</p>
        <p><strong>Description:</strong> This project implements a simple linked list in Java, allowing elements to be inserted at the end of the list.</p>
        
<h2>Project Structure</h2>
<ul>
    <li><strong>LinkedList.java</strong> - Implements the linked list and insertion logic.</li>
    <li><strong>Node.java</strong> - Defines the structure of a node in the linked list.</li>
</ul>

<h2>Usage</h2>
<p>To insert elements into the linked list, use the following code:</p>
<pre>
<code>LinkedList list = new LinkedList();
list.insert(5);
list.insert(10);
list.insert(15);</code>
        </pre>
        
  <h2>Explanation</h2>
  <p>The <code>insert(int data)</code> method works as follows:</p>
  <ol>
      <li>Creates a new node with the given data.</li>
      <li>If the list is empty (<code>head == null</code>), the new node becomes the head.</li>
      <li>Otherwise, the method traverses to the last node and appends the new node.</li>
  </ol>
  
  <h2>Example Output</h2>
  <pre>
<code>List after inserting: [5] → [10] → [15] → null</code>
        </pre>
        
  <h2>Contributing</h2>
  <p>Feel free to modify and improve this project. Contributions are welcome!</p>
</div>
</body>
</html>
