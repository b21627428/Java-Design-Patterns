<p>
The adapter design pattern is a structural design pattern that allows two unrelated/uncommon interfaces to work together. In other words, the adapter pattern makes two incompatible interfaces compatible without changing their existing code.</p>

<p>Since these are done via other teams or organizations, there is a very high chance that they will be using their own specifications. All of these ready-to-use geometric shapes are not implementing our Shape interface. Obviously, we can see that Triangle is implementing the GeometricShape interface. And, the GeometricShape interface is different from our Shape interface (incompatible).
</p>

Our Drawing client class can work only with Shape  and not GeometricShape. This makesGeometricShape  incompatible with our Drawing class.

### <strong>Now, What Should We Do?</strong><br/>
<ul>
<li>
We change our code and we change/remove our Shape interface and start using the  GeometricShape interface. Or, we can convert the GeometricShape interface into our  Shape interface, if its open source and changes are minimal. But, it's not always possible because of other functionality and code dependency.
</li>
<li>
Continuing with what we are coding, should we not use the ready-to-use code/APIs?
</li>
</ul>
No. Actually, all we need to have here is an adapter, which makes this ready-to-use code compatible with our code and the  Drawing in this example.

Now, when we are clear on why we need the adapter, let's take a closer look at what the adapter actually does. Before we start, below is the list of classes/objects used in the adapter pattern:

<ul>
<li>
<strong>Target</strong> — This defines the domain-specific interface that the client uses. This is the Shape interface in our example.
</li>
<li>
<strong>Adapter</strong>  — This adapts the interface from the adaptee to the target interface. I will point the adapter classes based on the different approach below.
</li>
<li>
<strong>Adaptee</strong>  — This defines an existing interface that needs adapting. This is the GeometricShape interface in our example.
</li>
<li>
<strong>Client</strong>  — This collaborates with objects conforming to the Target interface. The Drawing class is the client in our example.</li>
</ul>

### Adapter vs. Decorator Design Pattern:

##### Adapter Pattern:

<ul>
<li>
Makes a wrapper (Adapter) to create compatibility/conversion from one interface to the other interface which are incompatible.
</li>
<li>
Wrapper (Adapter) works on two incompatible interfaces/classes.
</li>
<li>
The intenstion of writing the wrapper class is to resolve the differences and make the interfaces compatible.
</li>
<li>
We rarely add any functionality in the wrapper class. 
</li>
</ul>

##### Decorator Pattern:

<ul>
<li>
Makes a wrapper (Decorator) to add/modify functionalities in the interface/class without changing the original code of the class. We use Abstract wrapper to implement this pattern, in general.</li>
<li>
Wrapper (Decorator) works on single interface/class.</li>
<li>
The intension of writing the wrapper class is to add/modify functionalities of the interface/class.</li>
<li>
There is no incompatibility issue since we deal only with one interface/classes at a time.
</li>
</ul>

### Resources

<ul>
<li>
https://dzone.com/articles/adapter-design-pattern-in-java
</li></ul>