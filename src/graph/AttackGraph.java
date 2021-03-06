/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.HashSet;

/**
 *
 * @author Gautham
 */
public class AttackGraph {
    HashSet<DerivationNode> Nr;
    HashSet<PrimitiveNode> Np;
    HashSet<DerivedNode> Nd;
    HashSet<Edge> E;
    LFunction Lf;
    Goal G;

    public AttackGraph(HashSet<DerivationNode> Nr, HashSet<PrimitiveNode> Np, HashSet<DerivedNode> Nd, HashSet<Edge> E, LFunction Lf, Goal G) {
        this.Nr = Nr;
        this.Np = Np;
        this.Nd = Nd;
        this.E = E;
        this.Lf = Lf;
        this.G = G;
    }

    public HashSet<DerivationNode> getNr() {
        return Nr;
    }

    public HashSet<PrimitiveNode> getNp() {
        return Np;
    }

    public HashSet<DerivedNode> getNd() {
        return Nd;
    }

    public HashSet<Edge> getE() {
        return E;
    }

    public LFunction getLf() {
        return Lf;
    }

    public Goal getG() {
        return G;
    }
    
    
    
}
