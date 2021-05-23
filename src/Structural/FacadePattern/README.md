
## Facade Design Pattern

<ul style="font-size: 16px">
<li>
The Facade object is used to provide a front-facing interface by masking a more complex underlying system.
</li>
<li>
The primary purpose of the Facade is to hide complexities of a system/subsystem by providing simpler interface to deal with.
</li>
<li>
In Java there are many features like JDBC, JPA, JAX-RS etc. which hides the minor details and provide a simpler interface in form of annotations or easier configuration to deal with.
</li>
</ul>

<br/>
<ol style="font-size: 16px">
<li>
<strong>Facade Pattern Vs Adapter Pattern</strong>
    <ul>
        <li>
Adapter Pattern allows to make incompatible system compatible. So, we fix the compatibility issue of the system with the client application. Without Adapter, we can't use the system (incompatible). Adapter generally works with one object.
        </li>
<hr/>
        <li>
Facade Pattern simplifies the complexity of the system (compatible but complex). Without Facade, we can still use the system. But it will require knowledge of lots of minor and inner details while we do that. Facade works with entire system.
        </li>
    </ul>
</li>

<br/>

<li>
<strong>Facade Pattern Vs Command Pattern</strong>
    <ul>
        <li>
Facade Pattern hides internal details and provide a simplified interface.        </li>
<hr/>
        <li>
Command Pattern encapsulates actions which are required perform a task (undoable set of actions).        </li>
    </ul>
</li>

<br/>

<li>
<strong>Facade Pattern Vs Proxy Pattern</strong>
    <ul>
        <li>
Proxy Pattern is similar to Facade except, it provides same interface as it's service object to make complex objects interchangeable.
        </li>
    </ul>
</li>

<br/>

<li>
<strong>Facade Pattern Vs Abstract Factory</strong>
    <ul>
        <li>
Abstract Factory is like Facade except it only handles the creation part of objects of the system/subsystem.<hr/>
        <li>
Facade handles system's objects operational part as well.    </ul>
</li>


<br/>

<li>
<strong>Facade Pattern Vs Singleton Pattern</strong>
    <ul>
        <li>
Facade Object normally we create as Singleton while implement since it serves for its purpose.        </li>
 </ul>
</li>


</ol>



### Resources

<ul>
<li>
https://dzone.com/articles/facade-design-pattern-in-java</li></ul>