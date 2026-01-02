# AI & ML Roadmap — From First Principles to Agents

---

## Goal

By the end of this roadmap, you should be able to:
- Explain *why* modern AI works
- Build LLM systems from scratch
- Design and debug agents
- Ship production-grade AI systems with evals

If it feels hard, good. That’s the bar.

---

## Prerequisites

You’re expected to know:
- Python
- Basic PyTorch
- Linear Algebra
- Probability
- Git + CLI

If not, fix that first.

---

## Roadmap

### 1. History & Foundations
- What is AI?
- Symbolic AI vs Statistical AI
- Why early AI failed
- Data + compute → modern AI
- What is Deep Learning?
- Backpropagation intuition
- NLP before transformers
- Why transformers won

---

### 2. Neural Networks (Core)
- Perceptron → MLP
- Activations
- Loss functions
- Gradient descent variants
- Overfitting & regularization

**Milestone**: Implement a neural network from scratch.

---

### 3. Optional: Classic Architectures

#### 3.1 RNNs, LSTMs, Sequential Models
- Why they existed
- Their limitations
- Where they still matter

#### 3.2 CNNs
- Convolutions intuition
- Feature hierarchies
- Why CNN ideas still matter

---

### 4. Attention From Scratch
- Why attention exists
- Query, Key, Value
- Scaled dot-product attention
- Masked attention

Implement attention manually in PyTorch.

---

### 5. Advanced Attention Variants
- KV Cache
- Multi-Head Attention
- GQA (Grouped Query Attention)
- MLA / MQA

Focus on **latency, memory, throughput tradeoffs**.

---

### 6. Transformers End-to-End (Hugging Face)
- Tokenizers
- Model configs
- Training vs inference
- Saving, loading, pushing models
- Avoiding magic abstractions

---

### 7. LLM Instrumentation & Observability
- Logging LLM calls
- Tracing agent steps
- Latency tracking
- Cost monitoring
- Failure analysis

If you can’t observe it, you can’t scale it.

---

### 8. Vector Databases & RAG
- Embeddings deep dive
- Similarity search
- Chunking strategies
- Retrieval failures
- RAG vs fine-tuning

Build **custom RAG**, not copy templates.

---

### 9. Context Engineering
- Prompt vs context
- Summarization pipelines
- Data collection
- Compression vs recall tradeoffs

---

### 10. Agents From First Principles
- What an agent really is
- Planning vs reacting
- Tools
- Control flow
- Failure loops

Build an agent **without frameworks first**.

---

### 11. Agent Frameworks
- Why they exist
- When to use them
- When not to
- Abstraction vs control tradeoffs

---

### 12. Memory Systems
- Short-term vs long-term memory
- Vector memory
- Episodic memory
- Read/write strategies
- Memory decay

---

### 13. Computer Use & Multimodal Agents
- Vision + language
- Screens, browsers, files
- Tool grounding
- Safety constraints

---

### 14. Fine-Tuning Fundamentals
- What fine-tuning actually changes
- Pretraining vs fine-tuning
- LoRA & adapters
- Dataset quality > dataset size

---

### 15. Fine-Tuning for Any Use Case
- Data pipelines
- Instruction tuning
- Domain adaptation
- Eval-first mindset

---

### 16. Reinforcement Learning Fine-Tuning
- Reward models
- PPO intuition
- RLHF / RLAIF
- Why RL fine-tuning is fragile

---

### 17. Evaluations (Mandatory)
- Unit tests for agents
- Behavioral evals
- Regression testing
- Automatic + human evals

No evals = guessing.

---

### 18. Advanced Topics
- Scaling laws
- Inference optimization
- Distillation
- Alignment
- Safety
- Future directions

---

## Projects (Required)

### 1. Agent Framework
Build a **minimal custom agent framework** from scratch.

### 2. RL Fine-Tuning + Evals
- Fine-tune a model
- Design proper evaluation pipelines

### 3. Devin-Style Agent
A task-solving autonomous agent with planning + tools.

### 4. Memory Framework
Reusable, modular memory system for agents.

---

## Final Note

This roadmap is not fast.
It’s not easy.
It’s designed to make you **dangerously competent**.

Build. Break. Debug. Repeat.
